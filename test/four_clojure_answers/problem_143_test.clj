(ns four-clojure-answers.problem-143-test
  (:use four-clojure-answers.problem-143
        clojure.test))

(deftest problem-143-test
  (are [xs ys expected]
    (= (answer xs ys) expected)
    [0 1 0] [1 0 0]    0
    [1 1 1] [1 1 1]    3
    [1 2 3] [4 5 6]    32
    [2 5 6] [100 10 1] 256))
