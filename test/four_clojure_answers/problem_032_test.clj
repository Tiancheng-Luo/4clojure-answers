(ns four-clojure-answers.problem-032-test
  (:use four-clojure-answers.problem-032
        clojure.test))

(deftest problem-032-test
  (are [coll expected]
    (= (answer coll) expected)
    [1 2 3] '(1 1 2 2 3 3)
    [:a :a :b :b] '(:a :a :a :a :b :b :b :b)
    [[1 2] [3 4]] '([1 2] [1 2] [3 4] [3 4])
    [[1 2] [3 4]] '([1 2] [1 2] [3 4] [3 4])))
