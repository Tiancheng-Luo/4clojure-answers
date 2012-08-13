(ns four-clojure-answers.problem-041-test
  (:use four-clojure-answers.problem-041
        clojure.test))

(deftest problem-041-test
  (are [coll n expected]
    (= (answer coll n) expected)
    [1 2 3 4 5 6 7 8] 3 [1 2 4 5 7 8]
    [:a :b :c :d :e :f] 2 [:a :c :e]
    [1 2 3 4 5 6] 4 [1 2 3 5 6]))
