(ns four-clojure-answers.problem-033)

(def answer
  (fn [coll n]
    (mapcat #(repeat n %) coll)))
