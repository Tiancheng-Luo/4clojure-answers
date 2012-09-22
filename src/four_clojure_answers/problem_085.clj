(ns four-clojure-answers.problem-085)

(def answer
  (fn [s]
    (reduce (fn [ps x]
              (into ps (map #(conj % x) ps)))
            #{#{}}
            s)))
