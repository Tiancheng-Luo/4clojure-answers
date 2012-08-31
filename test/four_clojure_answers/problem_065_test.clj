(ns four-clojure-answers.problem-065-test
  (:use four-clojure-answers.problem-065
        clojure.test))

(deftest problem-065-test
  (are [coll expected]
    (= (answer coll) expected)
    {:a 1, :b 2} :map
    (range (rand-int 20)) :list
    [1 2 3 4 5 6] :vector
    #{10 (rand-int 5)} :set)

  (is (= [:map :set :vector :list] (map answer [{} #{} [] ()]))))
