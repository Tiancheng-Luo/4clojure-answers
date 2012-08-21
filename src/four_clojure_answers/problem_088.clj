(ns four-clojure-answers.problem-088
  (:require clojure.set))

(def answer
  (fn [s1 s2]
    (clojure.set/difference
      (clojure.set/union s1 s2)
      (clojure.set/intersection s1 s2))))
