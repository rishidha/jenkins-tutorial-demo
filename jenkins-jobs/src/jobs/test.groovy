mavenJob('jenkins tutorial demo - Simple DSL job'){
    description'A very simple demo for job dsl'
    logRotator{
        numToKeep 5
    }
    parameters {
        gitParam('Branch')
        description'The git branch to checkout'
    }
}
