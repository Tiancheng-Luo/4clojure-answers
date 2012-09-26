(ns four-clojure-answers.problem-093-test
  (:use four-clojure-answers.problem-093
        clojure.test))

(deftest problem-093-test
  (doseq [answer [answer-a answer-b answer-c]]
    (are [s expected]
      (= (answer s) expected)
      [["Do"] ["Nothing"]] [["Do"] ["Nothing"]]
      [[[[:a :b]]] [[:c :d]] [:e :f]] [[:a :b] [:c :d] [:e :f]]
      '((1 2)((3 4)((((5 6)))))) '((1 2)(3 4)(5 6)))))
