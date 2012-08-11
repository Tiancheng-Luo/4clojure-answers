(ns four-clojure-answers.problem-033-test
  (:use four-clojure-answers.problem-033
        clojure.test))

(deftest problem-033-test
  (are [coll n expected]
    (= (answer coll n) expected)
    [1 2 3] 2 '(1 1 2 2 3 3)
    [:a :b] 4 '(:a :a :a :a :b :b :b :b)
    [4 5 6] 1 '(4 5 6)
    [[1 2] [3 4]] 2 '([1 2] [1 2] [3 4] [3 4])
    [44 33] 2 [44 44 33 33]))
