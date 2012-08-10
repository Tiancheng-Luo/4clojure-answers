(ns four-clojure-answers.problem-028-test
  (:use four-clojure-answers.problem-028
        clojure.test))

(deftest problem-028-test
  (are [coll expected]
    (= (answer coll) expected)
    '((1 2) 3 [4 [5 6]]) '(1 2 3 4 5 6)
    ["a" ["b"] "c"] '("a" "b" "c")
    '((((:a)))) '(:a)))
