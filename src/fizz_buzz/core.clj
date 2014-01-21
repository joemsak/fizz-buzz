(ns fizz-buzz.core)
(declare calculate-range calculate is-factor-of?)

(defn -main [number-range]
  (apply println (calculate-range number-range)))

(defn calculate-range [number-range]
  (map #(calculate %) number-range))

(defn calculate [number]
  (let [fizz? (is-factor-of? number 3)
        buzz? (is-factor-of? number 5)
        both? (and fizz? buzz?)]

    (cond both? "fizzbuzz"
          fizz? "fizz"
          buzz? "buzz"
          :else number)))

(defn is-factor-of? [n d]
  (zero? (rem n d)))
