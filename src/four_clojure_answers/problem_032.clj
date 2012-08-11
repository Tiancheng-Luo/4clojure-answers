(ns four-clojure-answers.problem-032)

(def answer
  (partial mapcat #(repeat 2 %)))
