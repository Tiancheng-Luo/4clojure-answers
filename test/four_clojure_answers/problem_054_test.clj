(ns four-clojure-answers.problem-054-test
  (:use four-clojure-answers.problem-054
        clojure.test))

(deftest problem-054-test
  (are [n coll expected]
    (= (answer n coll) expected)
    3 (range 9) '((0 1 2) (3 4 5) (6 7 8))
    2 (range 8) '((0 1) (2 3) (4 5) (6 7))
    3 (range 8) '((0 1 2) (3 4 5))))
