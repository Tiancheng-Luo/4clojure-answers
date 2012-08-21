(ns four-clojure-answers.problem-066-test
  (:use four-clojure-answers.problem-066
        clojure.test))

(deftest problem-066-test
  (are [m n expected]
    (= (answer m n) expected)
    2 4 2
    10 5 5
    5 7 1
    1023 858 33))
