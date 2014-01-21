(ns fizz-buzz.core)
(declare calculate is-factor-of?)

(defn -main [number-range]
  (let [fizz-buzzed (map #(calculate %) number-range)]
    (apply println fizz-buzzed)))

(defn calculate [number]
  (let [fizz? (is-factor-of? number 3)
        buzz? (is-factor-of? number 5)
        both? (and fizz? buzz?)]

    (cond
      both? "fizzbuzz"
      fizz? "fizz"
      buzz? "buzz"
      :else number)))

(defn is-factor-of? [n d]
  (zero? (rem n d)))
