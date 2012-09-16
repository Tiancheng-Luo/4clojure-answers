(ns four-clojure-answers.problem-080-test
  (:use four-clojure-answers.problem-080
        clojure.test))

(deftest problem-080-test
  (are [n]
    (true? (answer n))
    6
    496
    8128)

  (are [n]
    (false? (answer n))
    7
    500))
