(ns four-clojure-answers.problem-059)

(def answer
  (fn [& fs]
    (fn [& xs]
      (map #(apply % xs) fs))))
