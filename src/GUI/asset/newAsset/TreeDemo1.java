/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.asset.newAsset;

/**
 *
 * @author bagher
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class CustomTreeExample
		extends 	JFrame
 {
	// Instance attributes used in this example
	private	JPanel		topPanel;
	private	JTree		tree;
	private	JScrollPane scrollPane;

	// Constructor of main frame
	public CustomTreeExample()
	{
		// Set the frame characteristics
		setTitle( "Custom Data Model Tree Application" );
		setSize( 300, 200 );
		setBackground( Color.gray );

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create data for the tree
		DefaultMutableTreeNode root
					= new DefaultMutableTreeNode( "Deck" );

		CreateSuit( root, "Clubs" );
		CreateSuit( root, "Diamonds" );
		CreateSuit( root, "Spades" );
		CreateSuit( root, "Hearts" );

		// Create a new tree control
		MyDataModel treeModel = new MyDataModel( root );
		tree = new JTree( treeModel );

		// Add the listbox to a scrolling pane
		scrollPane = new JScrollPane();
		scrollPane.getViewport().add( tree );
		topPanel.add( scrollPane, BorderLayout.CENTER );
	}

	public void CreateSuit( DefaultMutableTreeNode root, String suitName )
	{
		DefaultMutableTreeNode itemSuit
						= new DefaultMutableTreeNode( suitName );
			for( int iCtr = 0; iCtr < 13; iCtr++ )
				itemSuit.add( new DefaultMutableTreeNode( "" ) );

		root.add( itemSuit );
	}

	// Main entry point for this example
	public static void main( String args[] )
	{
		// Create an instance of the test application
		CustomTreeExample mainFrame	= new CustomTreeExample();
		mainFrame.setVisible( true );
	}
}


// Imports


class MyDataModel
	extends		DefaultTreeModel
{
	private	DefaultMutableTreeNode	root;
	private	String rootName = "";
	private	String	cardArray[] = {
						"Ace",	"Two",	"Three",	"Four",
						"Five",	"Six",	"Seven",	"Eight",
						"Nine",	"Ten",	"Jack",		"Queen",
						"King"
					};
	
	public MyDataModel( TreeNode root )
	{
		super( root );
		DefaultMutableTreeNode	parentNode = (DefaultMutableTreeNode)root;
		rootName = (String)parentNode.getUserObject();
	}

	public Object getChild( Object parent, int index )
	{
		DefaultMutableTreeNode	parentNode = (DefaultMutableTreeNode)parent;
		String parentName = (String)parentNode.getUserObject();
		
		if( parentName.equals( rootName ) )
			return super.getChild( parent, index );
		else
			return new DefaultMutableTreeNode( cardArray[index] );
	}
}