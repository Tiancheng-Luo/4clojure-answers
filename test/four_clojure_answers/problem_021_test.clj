(ns four-clojure-answers.problem-021-test
  (:use four-clojure-answers.problem-021
        clojure.test))

(deftest problem-021-test
  (are [coll idx expected]
    (= (problem-021 coll idx) expected)
    '(4 5 6 7) 2 6
    [:a :b :c] 0 :a
    [1 2 3 4] 1 2
    '([1 2] [3 4] [5 6]) 2 [5 6]))
