(ns four-clojure-answers.problem-075-test
  (:use four-clojure-answers.problem-075
        clojure.test))

(deftest problem-075-test
  (are [n expected]
    (= (answer n) expected)
    1 1
    10 4
    40 16
    99 60))
