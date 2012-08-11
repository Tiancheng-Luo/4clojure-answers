(ns four-clojure-answers.problem-031-test
  (:use four-clojure-answers.problem-031
        clojure.test))

(deftest problem-031-test
  (are [coll expected]
    (= (answer coll) expected)
    [1 1 2 1 1 1 3 3] '((1 1) (2) (1 1 1) (3 3))
    [:a :a :b :b :c] '((:a :a) (:b :b) (:c))
    [[1 2] [1 2] [3 4]] '(([1 2] [1 2]) ([3 4]))))
