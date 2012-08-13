(ns four-clojure-answers.problem-038)

(def answer
  (comp (partial reduce #(if (> % %2) % %2)) list))
