(ns four-clojure-answers.problem-019-test
  (:use four-clojure-answers.problem-019
        clojure.test))

(deftest problem-019-test
    (are [coll expected]
      (= (answer coll) expected)
      [1 2 3 4 5] 5
      '(5 4 3) 3
      ["b" "c" "d"] "d"
      [] nil
      nil nil))
