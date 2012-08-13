(ns four-clojure-answers.problem-034-test
  (:use four-clojure-answers.problem-034
        clojure.test))

(deftest problem-034-test
  (are [start end expected]
    (= (answer start end) expected)
    1 4 '(1 2 3)
    -2 2 '(-2 -1 0 1)
    5 8 '(5 6 7)))
