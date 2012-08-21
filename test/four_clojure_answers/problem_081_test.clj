(ns four-clojure-answers.problem-081-test
  (:use four-clojure-answers.problem-081
        clojure.test))

(deftest problem-081-test
  (are [s1 s2 expected]
    (= (answer s1 s2) expected)
    #{0 1 2 3} #{2 3 4 5} #{2 3}
    #{0 1 2} #{3 4 5} #{}
    #{:a :b :c :d} #{:c :e :a :f :d} #{:a :c :d}))
