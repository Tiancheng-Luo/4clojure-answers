(ns four-clojure-answers.problem-056-test
  (:use four-clojure-answers.problem-056
        clojure.test))

(deftest problem-056-test
  (are [coll expected]
    (= (answer coll) expected)
    [1 2 1 3 1 2 4] [1 2 3 4]
    [:a :a :b :b :c :c] [:a :b :c]
    '([2 4] [1 2] [1 3] [1 3]) '([2 4] [1 2] [1 3])
    (range 50) (range 50)))
