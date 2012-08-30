(ns four-clojure-answers.problem-055-test
  (:use four-clojure-answers.problem-055
        clojure.test))

(deftest problem-055-test
  (doseq [answer [answer-a answer-b]]
    (are [coll expected]
      (= (answer coll) expected)
      [1 1 2 3 2 1 1] {1 4, 2 2, 3 1}
      [:b :a :b :a :b] {:a 2, :b 3}
      '([1 2] [1 3] [1 3]) {[1 2] 1, [1 3] 2})))
