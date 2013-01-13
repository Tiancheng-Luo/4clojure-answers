(ns four-clojure-answers.problem-171-test
  (:use four-clojure-answers.problem-171
        clojure.test))

(deftest problem-171-test
  (are [s expected]
    (= (answer s) expected)
    [1 2 3] [[1 3]]
    [10 9 8 1 2 3] [[1 3] [8 10]]
    [1 1 1 1 1 1 1] [[1 1]]
    [] []
    [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11] [[1 4] [6 6] [9 11] [13 17] [19 19]]))
