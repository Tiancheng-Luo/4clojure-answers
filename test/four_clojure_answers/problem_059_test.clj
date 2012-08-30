(ns four-clojure-answers.problem-059-test
  (:use four-clojure-answers.problem-059
        clojure.test))

(deftest problem-059-test
  (are [fs xs expected]
    (= (apply (apply answer fs) xs) expected)
    [+ max min] [2 3 5 1 6 4] [21 6 1]
    [#(.toUpperCase %) count] ["hello"] ["HELLO" 5]
    [:a :c :b] [{:a 2, :b 4, :c 6, :d 8 :e 10}] [2 6 4]))
