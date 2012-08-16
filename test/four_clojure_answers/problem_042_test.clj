(ns four-clojure-answers.problem-042-test
  (:use four-clojure-answers.problem-042
        clojure.test))

(deftest problem-042-test
  (are [n expected]
    (= (answer n) expected)
    1 1
    3 6
    5 120
    8 40320))
