(ns four-clojure-answers.problem-038-test
  (:use four-clojure-answers.problem-038
        clojure.test))

(deftest problem-038-test
  (are [nums expected]
    (= (apply answer nums) expected)
    [1 8 3 4] 8
    [30 20] 30
    [45 67 11] 67))
