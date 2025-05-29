SRC_DIR = src
BIN_DIR = bin
SRC_FILES = "./sources.txt"
SOURCES := $(shell find $(SRC_DIR) -name "*.java" > $(SRC_FILES))
SRC_FILES := $(shell cat $(SRC_FILES))
CLASSES := $(SRC_FILES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)
JAVAC = javac
JAVAFLAGS = -d $(BIN_DIR) -sourcepath $(SRC_DIR)
MAIN = Entrypoint/Main

all: $(CLASSES)

$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(dir $@)
	$(JAVAC) $(JAVAFLAGS) $<

run:
	java -cp $(BIN_DIR) $(MAIN)

clean:
	rm -rf $(BIN_DIR)/* $(SRC_FILEs)

re:
	@$(MAKE) clean
	@$(MAKE) all

.PHONY: all run clean
