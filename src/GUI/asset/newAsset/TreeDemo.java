/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package GUI.asset.newAsset;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class AddTreeExample
		extends 	JFrame
 {
	// Instance attributes used in this example
	private	JPanel		topPanel;
	private	JTree		tree;
	private	JScrollPane scrollPane;

	// Constructor of main frame
	public AddTreeExample()
	{
		// Set the frame characteristics
		setTitle( "More Advanced Tree Application" );
		setSize( 300, 200 );
		setBackground( Color.gray );

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create data for the tree
		DefaultMutableTreeNode root
					= new DefaultMutableTreeNode( "Deck" );

		DefaultMutableTreeNode itemClubs
					= new DefaultMutableTreeNode( "Clubs" );
		addAllCard( itemClubs );
		root.add( itemClubs );

		DefaultMutableTreeNode itemDiamonds
					= new DefaultMutableTreeNode( "Diamonds" );
		addAllCard( itemDiamonds );
		root.add( itemDiamonds );

		DefaultMutableTreeNode itemSpades
					= new DefaultMutableTreeNode( "Spades" );
		addAllCard( itemSpades );
		root.add( itemSpades );

		DefaultMutableTreeNode itemHearts
					= new DefaultMutableTreeNode( "Hearts" );
		addAllCard( itemHearts );
		root.add( itemHearts );

		// Create a new tree control
		DefaultTreeModel treeModel = new DefaultTreeModel( root );
		tree = new JTree( treeModel );


		// Add the listbox to a scrolling pane
		scrollPane = new JScrollPane();
		scrollPane.getViewport().add( tree );
		topPanel.add( scrollPane, BorderLayout.CENTER );
	}

	// Helper method to write an enitre suit of cards to the
	// current tree node
	public void addAllCard( DefaultMutableTreeNode suit )
	{
		suit.add( new DefaultMutableTreeNode( "Ace" ) );
		suit.add( new DefaultMutableTreeNode( "Two" ) );
		suit.add( new DefaultMutableTreeNode( "Three" ) );
		suit.add( new DefaultMutableTreeNode( "Four" ) );
		suit.add( new DefaultMutableTreeNode( "Five" ) );
		suit.add( new DefaultMutableTreeNode( "Six" ) );
		suit.add( new DefaultMutableTreeNode( "Seven" ) );
		suit.add( new DefaultMutableTreeNode( "Eight" ) );
		suit.add( new DefaultMutableTreeNode( "Nine" ) );
		suit.add( new DefaultMutableTreeNode( "Ten" ) );
		suit.add( new DefaultMutableTreeNode( "Jack" ) );
		suit.add( new DefaultMutableTreeNode( "Queen" ) );
		suit.add( new DefaultMutableTreeNode( "King" ) );
	}

	// Main entry point for this example
	public static void main( String args[] )
	{
		// Create an instance of the test application
		AddTreeExample mainFrame	= new AddTreeExample();
		mainFrame.setVisible( true );
	}
}