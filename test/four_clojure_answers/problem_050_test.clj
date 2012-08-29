(ns four-clojure-answers.problem-050-test
  (:use four-clojure-answers.problem-050
        clojure.test))

(deftest problem-050-test
  (are [coll expected]
    (= (set (answer coll)) expected)
    [1 :a 2 :b 3 :c] #{[1 2 3] [:a :b :c]}
    [:a "foo"  "bar" :b] #{[:a :b] ["foo" "bar"]}
    [[1 2] :a [3 4] 5 6 :b] #{[[1 2] [3 4]] [:a :b] [5 6]}))
