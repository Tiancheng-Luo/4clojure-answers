(ns four-clojure-answers.problem-157)

(def answer
  (partial map-indexed (fn [i v] [v i])))
