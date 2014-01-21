(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all :as fizz-buzz]))

(defn assert-result [input output]
  (is (= output (fizz-buzz/run input))))

(defn assert-returned [number]
  (assert-result number number))

(defn assert-fizz [input]
  (assert-result input "fizz"))

(defn assert-buzz [input]
  (assert-result input "buzz"))

(defn assert-fizzbuzz [input]
  (assert-result input "fizzbuzz"))

(deftest factors-of-three-are-fizz-test
  (testing "factors of 3 are a fizz" (assert-fizz 3) (assert-fizz 333)))

(deftest factors-of-five-are-buzz-test
  (testing "factors of 5 are a buzz" (assert-buzz 5) (assert-buzz 85)))

(deftest everything-else-is-itself-test
  (testing "other numbers are simply returned"
           (assert-returned 1) (assert-returned 2) (assert-returned 4)
           (assert-returned 7) (assert-returned 8) (assert-returned 11)
           (assert-returned 13) (assert-returned 14) (assert-returned 16)))

(deftest factors-of-both-return-fizzbuzz-test
  (testing "factors of 3 and 5 return fizzbuzz"
           (assert-fizzbuzz 15) (assert-fizzbuzz 30) (assert-fizzbuzz 5340)))
