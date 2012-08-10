(ns four-clojure-answers.problem-026-test
  (:use four-clojure-answers.problem-026
        clojure.test))

(deftest problem-026-test
  (are [n expected]
    (= (answer n) expected)
    3 '(1 1 2)
    6 '(1 1 2 3 5 8)
    8 '(1 1 2 3 5 8 13 21)))
