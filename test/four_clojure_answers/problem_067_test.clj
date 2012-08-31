(ns four-clojure-answers.problem-067-test
  (:use four-clojure-answers.problem-067
        clojure.test))

(deftest problem-067-test
  (are [n expected]
    (= (answer n) expected)
    2 [2 3]
    5 [2 3 5 7 11])

  (is (= (last (answer 100)) 541)))
