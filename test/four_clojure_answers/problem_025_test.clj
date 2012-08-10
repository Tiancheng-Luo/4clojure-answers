(ns four-clojure-answers.problem-025-test
  (:use four-clojure-answers.problem-025
        clojure.test))

(deftest problem-025-test
  (are [coll expected]
    (= (answer coll) expected)
    #{1 2 3 4 5} '(1 3 5)
    [4 2 1 6] '(1)
    [2 2 4 6] ()
    [1 1 1 3] '(1 1 1 3)))
