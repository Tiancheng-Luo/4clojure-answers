(ns four-clojure-answers.problem-135-test
  (:use four-clojure-answers.problem-135
        clojure.test))

(deftest problem-135-test
  (are [expr expected]
    (= (apply answer expr) expected)
    [2 + 5] 7
    [38 + 48 - 2 / 2] 42
    [10 / 2 - 1 * 2] 8
    [20 / 2 + 2 + 4 + 8 - 6 - 10 * 9] 72))
