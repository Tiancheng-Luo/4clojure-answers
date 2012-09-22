(ns four-clojure-answers.problem-086-test
  (:use four-clojure-answers.problem-086
        clojure.test))

(deftest problem-086-test
  (are [n]
    (true? (answer n))
    7
    986543210)

  (are [n]
    (false? (answer n))
    2
    3))
