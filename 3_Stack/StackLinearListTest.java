package org.likebnb.ds.stack;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.likebnb.ds.stack.Stack.OverflowException;
import org.likebnb.ds.stack.Stack.UnderflowException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackLinearListTest {
	final static private Logger LOG = LoggerFactory.getLogger(StackLinearListTest.class);

	static StackLinearList<String> stack;
	
	@BeforeAll
	static public void beforeEach() {
		LOG.info("Before All");
		stack = new StackLinearList<String>(5);
	}

	@AfterAll
	static public void afterEach() {
		LOG.info("After All");
		stack = null;
	}
	
	@Test
	public void testCase00() {
		try {
			stack.push(new StackNode<String>("1st Node"));
			LOG.info("{}", stack);
			
			stack.peek();
			LOG.info("{}", stack);
			
			stack.push(new StackNode<String>("2nd Node"));
			LOG.info("{}", stack);
			
			stack.pop();
			LOG.info("{}", stack);
			
			stack.push(new StackNode<String>("3rd Node"));
			LOG.info("{}", stack);
			
			stack.push(new StackNode<String>("4th Node"));
			LOG.info("{}", stack);
			
			stack.push(new StackNode<String>("5th Node"));
			LOG.info("{}", stack);

			stack.push(new StackNode<String>("6th Node"));
			LOG.info("{}", stack);
			
			stack.push(new StackNode<String>("7th Node"));
			LOG.info("{}", stack);

		} catch (UnderflowException | OverflowException e) {
			LOG.warn("{}", e.getMessage());
		}
	}
}
