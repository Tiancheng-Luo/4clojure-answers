(ns four-clojure-answers.problem-099)

(def answer
  (fn [n m]
    (->> (* n m)
      str
      (re-seq #".")
      (map #(Integer/valueOf %)))))
