(ns fizz-buzz.core)

(defn is-divisible-by? [n d]
  (zero? (rem n d)))

(defn calculate [number]
  (let [fizz? (is-divisible-by? number 3)
        buzz? (is-divisible-by? number 5)
        both? (and fizz? buzz?)]

    (cond
      both? "fizzbuzz"
      fizz? "fizz"
      buzz? "buzz"
      :else number)))

(defn run [number-range]
  (let [fizz-buzzed (map #(calculate %) number-range)]
    (apply println fizz-buzzed)))
