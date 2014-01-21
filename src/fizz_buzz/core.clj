(ns fizz-buzz.core)


(defn calculate [number]
  (let [fizz? (is-factor-of? number 3)
        buzz? (is-factor-of? number 5)
        both? (and fizz? buzz?)]

    (cond
      both? "fizzbuzz"
      fizz? "fizz"
      buzz? "buzz"
      :else number)))

(defn run [number-range]
  (let [fizz-buzzed (map #(calculate %) number-range)]
    (apply println fizz-buzzed)))

(defn is-factor-of? [n d]
  (zero? (rem n d)))
