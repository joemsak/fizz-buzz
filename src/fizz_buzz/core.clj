(ns fizz-buzz.core)

(defn fizz? [number]
  (zero? (rem number 3)))

(defn buzz? [number]
  (zero? (rem number 5)))

(defn both? [number]
  (and (fizz? number) (buzz? number)))

(defn run [number]
  (cond
    (both? number) "fizzbuzz"
    (fizz? number) "fizz"
    (buzz? number) "buzz"
    :else number))
