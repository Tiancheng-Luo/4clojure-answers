(ns four-clojure-answers.problem-044)

(def answer-a
  (fn [n coll]
    (let [idx (mod n (count coll))]
      (concat (drop idx coll) (take idx coll)))))

(def answer-b
  (fn [n coll]
    (let [len (count coll)]
      (take len (drop (mod n len) (cycle coll))))))
