(ns four-clojure-answers.problem-100-test
  (:use four-clojure-answers.problem-100
        clojure.test))

(deftest problem-100-test
  (are [nums expected]
    (= (apply answer nums) expected)
    [2 3] 6
    [5 3 7] 105
    [1/3 2/5] 2
    [3/4 1/6] 3/2
    [7 5/7 2 3/5] 210))
