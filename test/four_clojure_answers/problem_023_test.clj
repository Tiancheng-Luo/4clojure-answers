(ns four-clojure-answers.problem-023-test
  (:use four-clojure-answers.problem-023
        clojure.test))

(deftest problem-023-test
  (doseq [answer [answer-023-a answer-023-b]]
    (are [coll expected]
      (= (answer coll) expected)
      [1 2 3 4 5] [5 4 3 2 1]
      (sorted-set 5 7 2 7) '(7 5 2)
      [[1 2][3 4][5 6]] [[5 6][3 4][1 2]])))
