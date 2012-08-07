(ns four-clojure-answers.problem-020-test
  (:use four-clojure-answers.problem-020
        clojure.test))

(deftest problem-020-test
  (are [coll expected]
    (= (problem-020 coll) expected)
    (list 1 2 3 4 5) 4
    ["a" "b" "c"] "b"
    [[1 2] [3 4]] [1 2]))
