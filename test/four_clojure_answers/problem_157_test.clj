(ns four-clojure-answers.problem-157-test
  (:use four-clojure-answers.problem-157
        clojure.test))

(deftest problem-157-test
  (are [s expected]
    (= (answer s) expected)
    [:a :b :c] [[:a 0] [:b 1] [:c 2]]
    [0 1 3] '((0 0) (1 1) (3 2))
    [[:foo] {:bar :baz}] [[[:foo] 0] [{:bar :baz} 1]]))
