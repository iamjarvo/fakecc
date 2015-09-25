(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'fakecc.core
                       :output-to "main.js"
                       :target :nodejs})
