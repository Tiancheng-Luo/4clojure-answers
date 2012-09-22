(ns four-clojure-answers.problem-085-test
  (:use four-clojure-answers.problem-085
        clojure.test))

(deftest problem-085-test
  (are [s expected]
    (= (answer s) expected)
    #{1 :a} #{#{1 :a} #{:a} #{} #{1}}
    #{} #{#{}}
    #{1 2 3} #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}})

  (is (= (count (answer (into #{} (range 10)))) 1024)))
