(ns four-clojure-answers.problem-099-test
  (:use four-clojure-answers.problem-099
        clojure.test))

(deftest problem-099-test
  (are [n m expected]
    (= (answer n m) expected)
    1 1 [1]
    99 9 [8 9 1]
    999 99 [9 8 9 0 1]))
