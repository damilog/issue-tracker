//
//  IssueCoordinator.swift
//  issue-tracker
//
//  Created by 이다훈 on 2021/06/08.
//

import UIKit

class IssueCoordinator: NSObject, Coordinator {
    
    var navigationController: UINavigationController
    
    let example = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "main") as! ViewController
    
    override init(){
        
        self.navigationController = UINavigationController(rootViewController: example)
        navigationController.tabBarItem = UITabBarItem(title: "예시", image: UIImage.init(systemName: "exclamationmark.circle"), tag: 0)
        super.init()
        example.coordinator = self
    }
    
    func pushIssueView(_ navigationController: UINavigationController) {
        pushToView(navigationController, title: "이슈", vc: example)
    }
}
